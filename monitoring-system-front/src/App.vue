<template>
  <v-app>
    <v-navigation-drawer app v-model="drawer">
      <v-list nav dense>
        <v-list-item
          v-for="item in items"
          :key="item.title"
          @click="item.click"
        >
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>
          <v-list-item-title>{{ item.title }}</v-list-item-title>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    <v-app-bar hide-on-scroll app dense color="blue-grey darken-4" dark>
      <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>
      <v-toolbar-title>
        <h3>HARANG MONITORING SYSTEM</h3>
      </v-toolbar-title>
    </v-app-bar>
    <v-main>
      <router-view></router-view>
    </v-main>
    <GoTop :bottom="20" :right="20" :size="50"></GoTop>
  </v-app>
</template>

<script>
import GoTop from '@inotom/vue-go-top';

export default {
  name: 'App',

  components: {
    GoTop,
  },

  data() {
    return {
      drawer: false,
      items: [
        {
          click: this.pushHome,
          icon: 'mdi-home',
          title: '홈페이지',
        },
        {
          click: this.pushLive,
          icon: 'mdi-clock',
          title: '실시간 데이터',
        },
        {
          click: this.pushHistory,
          icon: 'mdi-chart-bar',
          title: '축적 데이터',
        },
      ],
    };
  },

  methods: {
    pushHome() {
      this.$router.push('/');
    },
    pushLive() {
      this.$router.push('/live');
    },
    pushHistory() {
      this.$router.push('/history');
    },
  },

  created() {},
};
</script>
