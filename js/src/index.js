"use strict";

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
