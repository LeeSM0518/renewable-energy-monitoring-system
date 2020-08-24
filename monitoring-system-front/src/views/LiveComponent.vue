<template>
  <v-container fluid>
    <v-row justify="center">
      <p class="text-h6">실시간 데이터</p>
      <v-col cols="12">
        <v-btn
          v-for="btn in charts"
          :key="btn.id"
          color="blue-grey"
          class="ma-2 white--text"
          :href="btn.link"
        >
          {{ btn.title }}
        </v-btn>
      </v-col>
      <v-col v-for="chart in charts" :id="chart.id" :key="chart.id" cols="12">
        <v-card elevation="10" dense class="blue-grey darken-4" dark>
          <v-card-title
            ><strong>{{ chart.title }}</strong></v-card-title
          >
          <v-card-text class="white primary--text">
            <v-col cols="12">
              <DataChart
                :xText="chart.xText"
                :yText="chart.yText"
                :createRandomY="chart.method"
              ></DataChart>
            </v-col>
          </v-card-text>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import DataChart from './charts/DataChart.vue';

export default {
  name: 'Home',
  components: {
    DataChart,
  },
  data: function() {
    return {
      charts: [
        {
          id: 0,
          title: 'PV 전압',
          xText: 'Time',
          yText: 'Voltage(V)',
          method: () => {
            return 493 + Math.random() * 7;
          },
        },
        {
          id: 1,
          title: 'PV 전류',
          xText: 'Time',
          yText: 'Current(A, rms)',
          method: () => {
            return 23 + Math.random() * 2;
          },
        },
        {
          id: 2,
          title: 'PV 출력',
          xText: 'Time',
          yText: 'Watt(W)',
          method: () => {
            return (493 + Math.random() * 7) * (23 + Math.random() * 2);
          },
        },
        {
          id: 3,
          title: '출력 전압',
          xText: 'Time',
          yText: 'Voltage(V, rms)',
          method: () => {
            return 380;
          },
        },
        {
          id: 4,
          title: '출력 전류',
          xText: 'Time',
          yText: 'Current(A, rms)',
          method: () => {
            return 70 + Math.random() * 5.0;
          },
        },
        {
          id: 5,
          title: '현재 출력',
          xText: 'Time',
          yText: 'Watt(W, rms)',
          method: () => {
            return 380 * (70 + Math.random() * 5.0);
          },
        },
        {
          id: 6,
          title: '역률',
          xText: 'Time',
          yText: 'Percent(%)',
          method: () => {
            return 99.9;
          },
        },
        {
          id: 7,
          title: '주파수',
          xText: 'Time',
          yText: 'Hertz(Hz)',
          method: () => {
            return 60;
          },
        },
      ],
    };
  },
  created: function() {
    for (var i = 0; i < this.charts.length; i++) {
      this.charts[i]['link'] = '/live#' + this.charts[i].id;
    }
  },
};
</script>
