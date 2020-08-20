<template>
  <v-app>
    <v-app-bar app dense color="blue-grey darken-4" dark>
      <v-toolbar-title>
        <h3>HARANG MONITORING SYSTEM</h3>
      </v-toolbar-title>
    </v-app-bar>
    <v-main>
      <router-view></router-view>
    </v-main>
  </v-app>
</template>

<script>
export default {
  name: 'App',

  components: {},

  data: () => ({
    //
  }),

  created() {},
};
</script>
