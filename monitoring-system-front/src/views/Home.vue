<template>
  <v-container>
    <v-row class="mt-7" justify="center">
      <v-col cols="10">
        <v-card outlined>
          <v-list-item three-line>
            <v-list-item-content>
              <v-list-item-title class="headline mb-1"
                >실시간 데이터</v-list-item-title
              >
              <v-list-item-subtitle
                >1초 주기의 실시간 데이터를 볼 수 있다.</v-list-item-subtitle
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
    <v-row justify="center">
      <v-col cols="10">
        <v-card outlined>
          <v-list-item three-line>
            <v-list-item-content>
              <v-list-item-title class="headline mb-1"
                >축적 데이터</v-list-item-title
              >
              <v-list-item-subtitle
                >1시간 주기의 24시간 데이터를 볼 수 있다.</v-list-item-subtitle
              >
            </v-list-item-content>
          </v-list-item>

          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
              color="blue-grey darken-4"
              class="white--text"
              @click="pushHistory"
              >View</v-btn
            >
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  methods: {
    pushLive() {
      this.$router.push('/live');
    },
    pushHistory() {
      this.$router.push('/history');
    },
  },
};
</script>

<style></style>
