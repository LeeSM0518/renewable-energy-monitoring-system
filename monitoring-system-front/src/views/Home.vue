<template>
  <v-container>
    <v-row justify="center">
      <v-col cols="3">
        <v-card outlined>
          <v-list-item three-line>
            <v-list-item-content>
              <v-list-item-title class="headline mb-1"
                >기기 제어</v-list-item-title
              >
              <v-list-item-subtitle
                >기기를 정지하거나 시작시킬 수 있습니다.</v-list-item-subtitle
              >
            </v-list-item-content>
          </v-list-item>

          <v-card-actions>
            <v-btn color="primary" class="white--text" @click="run">On</v-btn>
            <v-spacer></v-spacer>
            <v-btn color="grey" class="white--text" @click="stop">Off</v-btn>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
    <v-row class="mt-7" justify="center">
      <v-col cols="10">
        <v-card outlined>
          <v-list-item three-line>
            <v-list-item-content>
              <v-list-item-title class="headline mb-1"
                >실시간 데이터</v-list-item-title
              >
              <v-list-item-subtitle
                >1초 주기의 실시간 데이터를 볼 수
                있습니다.</v-list-item-subtitle
              >
            </v-list-item-content>
          </v-list-item>

          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
              color="blue-grey darken-4"
              class="white--text"
              @click="pushLive"
              >View</v-btn
            >
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import { run, stop } from '@/api/control.js';

export default {
  methods: {
    pushLive() {
      this.$router.push('/live');
    },
    run() {
      run();
    },
    stop() {
      stop();
    },
  },
};
</script>

<style></style>
