# coding: utf-8

import random

params = u"しくてがない"
target = u"しがない"

def shiganai():
    for i in range(100):
        res = ''.join(random.sample(params, len(params)))
        test = res[0] + res[1] + res[2] + res[3]
        result = test == target
        if result:
            print("第{}回SIerのSEからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」".format(i + 1))
            break
    if not result:
        print("「{}ラジオ」ちゃうやん".format(test.encode("utf-8")))

shiganai()
