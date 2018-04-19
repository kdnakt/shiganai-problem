# coding: utf-8

import random

params = u"しくてがない"
shiganai = "しがない"

def shiganai():
    for i in range(100):
        res = ''.join(random.sample(params, len(params)))
        test = res[0] + res[1] + res[2] + res[3]
        if test == shiganai:
            print(test)
            break
    print("end")

shiganai()
