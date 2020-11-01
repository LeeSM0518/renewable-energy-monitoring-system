w<template>
  <v-container fluid>
    <v-row justify="center">
      <p class="text-h6">기기 제어</p>
      <v-col cols="12">
        <v-card elevation="10" dense class="blue-grey darken-4" dark>
          <v-card-title><strong>Control</strong></v-card-title>
          <v-card-text class="white primary--text">
            <v-row justify="center" align="center">
              <v-btn>asd</v-btn>
              <v-btn>asd</v-btn>
            </v-row>
          </v-card-text>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
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
  components: {},
  data: () => ({}),
};
</script>
