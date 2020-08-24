<template>
  <Chart class="pa-1" :options="pvVoltageChartOptions"></Chart>
</template>

<script>
import { Chart } from 'highcharts-vue';

var createData = null;

export default {
  props: ['xText', 'yText', 'createRandomY'],
  components: {
    Chart,
  },
  data: function() {
    var createRandomY = this.createRandomY;
    return {
      pvVoltageChartOptions: {
        chart: {
          type: 'spline',
          animation: Highcharts.svg, // don't animate in old IE
          marginRight: 10,
          events: {
            load: function() {
              // set up the updating of the chart each second
              var series = this.series[0];
              createData = setInterval(function() {
                var x = new Date().getTime(), // current time
                  y = createRandomY();
                series.addPoint([x, y], true, true);
              }, 1000);
            },
          },
          height: 300,
        },

        time: {
          useUTC: false,
        },

        title: {
          text: null,
        },

        accessibility: {
          announceNewData: {
            enabled: true,
            minAnnounceInterval: 15000,
            announcementFormatter: function(allSeries, newSeries, newPoint) {
              if (newPoint) {
                return 'New point added. Value: ' + newPoint.y;
              }
              return false;
            },
          },
        },

        xAxis: {
          title: {
            text: `<b>${this.xText}</b>`,
          },
          type: 'datetime',
          tickPixelInterval: 150,
        },

        yAxis: {
          title: {
            text: `<b>${this.yText}</b>`,
          },
          plotLines: [
            {
              value: 0,
              width: 1,
              color: '#808080',
            },
          ],
        },

        tooltip: {
          headerFormat: '<b>{series.name}</b><br/>',
          pointFormat: '{point.x:%Y-%m-%d %H:%M:%S}<br/>{point.y:.2f}',
        },

        legend: {
          enabled: false,
        },

        exporting: {
          enabled: false,
        },

        series: [
          {
            name: 'data',
            data: (function() {
              // generate an array of random data
              var data = [],
                time = new Date().getTime(),
                i;

              for (i = -60; i <= 0; i += 1) {
                data.push({
                  x: time + i * 1000,
                  y: createRandomY(),
                });
              }
              return data;
            })(),
          },
        ],
      },
    };
  },
  beforeDestroy: function() {
    clearInterval(createData);
  },
  destroyed: function() {
    clearInterval(createData);
  },
};
</script>

<style></style>
