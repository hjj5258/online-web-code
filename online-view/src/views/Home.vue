<template>
  <div class="home">
    <div class="room-create-div">
      <a-button
        class="room-create-btn"
        type="primary"
        :loading="loading"
        @click="genClick()"
      >
        {{ loadingText }}
      </a-button>
    </div>

    <h1 class="room-no">房间号：{{ roomCode }}</h1>
  </div>
</template>

<script>
export default {
  name: "Home",
  data() {
    return {
      test: 0,
      loading: false,
      loadingText: "生成房间号",
      roomCode: "",
    };
  },
  created() {},
  mounted() {},
  methods: {
    async genClick() {
      this.loading = true;
      fetch("http://localhost:8001/online-doc/connection/test", {
        method: "GET",
        // headers: {
        //   "Access-Control-Allow-Origin": "http://localhost:8001",
        // },
      })
        .then((response) => response.text())
        .then((data) => {
          setTimeout(() => {
            this.roomCode = data;
            this.loading = false;
          }, 1000);
        });
      // .catch((err) => console.log("Request Failed", err));

      // .then((response) => {
      //   // console.log(response);
      // })
      // .then((json) => {
      //   console.log("json", this.json);
      //   self.test = json;
      //   console.log(this.test);
      // })
      // .catch((err) => console.log("Request Failed", err));
      // const response = await fetch(url, {
      //   method: "POST",
      //   headers: {
      //     "Content-type": "application/x-www-form-urlencoded; charset=UTF-8",
      //   },
      //   body: "foo=bar&lorem=ipsum",
      // });
    },
  },
};
</script>
<style>
.home {
  height: 800px;
  width: 50%;
  margin: auto;
}

.room-no {
  width: 50%;
  margin: auto;
  text-align: center;
  margin-top: 30%;
}

.room-create-div {
  height: 200px;
  width: 80%;
  margin: auto;
  text-align:
   center;
}

.room-create-btn {
  font-size: 48px !important;
  height: 200px !important;
  width: 50% !important;
  margin: auto !important;
  margin-top: 20% !important;
  text-align: center !important;
}
</style>
