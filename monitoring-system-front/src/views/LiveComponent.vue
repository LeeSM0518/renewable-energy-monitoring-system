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
import { getData } from '@/api/data.js';

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
          method: async () => {
            var { data } = await getData();
            return data.pvVoltage;
          },
        },
        {
          id: 1,
          title: 'PV 전류',
          xText: 'Time',
          yText: 'Current(A, rms)',
          method: async () => {
            var { data } = await getData();
            return data.pvElectricCurrent;
          },
        },
        {
          id: 2,
          title: 'PV 출력',
          xText: 'Time',
          yText: 'Watt(W)',
          method: async () => {
            var { data } = await getData();
            return data.pvOutput;
          },
        },
        {
          id: 3,
          title: '출력 전압',
          xText: 'Time',
          yText: 'Voltage(V, rms)',
          method: async () => {
            var { data } = await getData();
            return data.outputVoltage;
          },
        },
        {
          id: 4,
          title: '출력 전류',
          xText: 'Time',
          yText: 'Current(A, rms)',
          method: async () => {
            var { data } = await getData();
            return data.outputElectricCurrent;
          },
        },
        {
          id: 5,
          title: '현재 출력',
          xText: 'Time',
          yText: 'Watt(W, rms)',
          method: async () => {
            var { data } = await getData();
            return data.currentOutput;
          },
        },
        {
          id: 6,
          title: '역률',
          xText: 'Time',
          yText: 'Percent(%)',
          method: async () => {
            var { data } = await getData();
            return data.powerFactor;
          },
        },
        {
          id: 7,
          title: '주파수',
          xText: 'Time',
          yText: 'Hertz(Hz)',
          method: async () => {
            var { data } = await getData();
            return data.frequency;
          },
        },
      ],
    };
  },

  methods: {
    async get() {
      const { data } = await getData();
      return data;
    },
  },

  created: function() {
    console.log(this.get().id);
    for (var i = 0; i < this.charts.length; i++) {
      this.charts[i]['link'] = '/live#' + this.charts[i].id;
    }
  },
};
</script>
