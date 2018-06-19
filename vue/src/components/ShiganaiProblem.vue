<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button v-on:click="getResult">Try</button>
  </div>
</template>

<script>
export default {
  name: 'ShiganaiProblem',
  props: {
    msg: String
  },
  methods: {
    getResult: function() {
      const LOOP_COUNT = 100;
      const CHARS = "しくてがない";
      const TARGET = "しがない";

      function getRandomWord() {
        const arr = CHARS.split("");
        let clen = CHARS.length;
        var word = "";
        for (let i = 0, len = TARGET.length; i < len; i++) {
          let n = Math.floor(Math.random() * clen--);
          word += arr[n];
          arr.splice(n, 1);
        }
        return word;
      }

      function shiganai() {
        let i = 0;
        let msg, title;
        for (; i < LOOP_COUNT; i++) {
          title = getRandomWord();
          if (title == TARGET) {
            msg = `第${i + 1}回SIerのSEからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」`;
            break;
          }
        }
        if (msg) {
          return msg;
        } else {
          return `「${title}ラジオ」ちゃうやん`;
        }
      }

      this.msg = shiganai();
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.hello {
  word-wrap: break-word;
  width: 50%;
  margin: 8px auto;
}
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
