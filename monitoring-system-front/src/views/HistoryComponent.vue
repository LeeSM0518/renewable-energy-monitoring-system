<template>
  <v-container fluid>
    <v-row justify="center">
      <p class="text-h6">축적 데이터</p>
      <v-col cols="12">
        <v-card elevation="10" dense class="blue-grey darken-4" dark>
          <v-card-title><strong>PV 전압</strong></v-card-title>
          <v-card-text class="white primary--text">
            <v-col cols="12">
              <Chart class="pa-1" :options="pvVoltageChartOptions"></Chart>
            </v-col>
          </v-card-text>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import { Chart } from 'highcharts-vue';

let min = 0;
let max = 60;
let plus = 1;

let xList = [];
for (let i = min; i <= max; i += plus) {
  xList.push(i);
}

function randomList() {
  let randomList = [];
  for (let i = min; i <= max; i += plus) {
    randomList.push(Math.floor(Math.random() * 100 + 1));
  }
  return randomList;
}

export default {
  name: 'Home',
  components: {
    Chart,
  },
  data: () => ({
    pvVoltageChartOptions: {
      chart: {
        type: 'line',
      },
      title: {
        text: null,
      },
      subtitle: {
        text: null,
      },
      xAxis: {
        title: {
          text: `<strong>m(minute)</strong>`,
        },
        categories: xList,
      },
      yAxis: {
        title: {
          text: `<strong>Voltage(V)</strong>`,
        },
        max: 100,
        min: 0,
      },
      plotOptions: {
        line: {
          dataLabels: {
            enabled: false,
          },
          enableMouseTracking: false,
        },
      },
      series: [
        {
          name: '전압',
          data: randomList(),
        },
      ],
    },
  }),
};
</script>
