package main

import (
	"fmt"
	"math/rand"
	"time"
)

func getTarget() string {
	words := [6]string{"し", "く", "て", "が", "な", "い"}
	rand.Seed(time.Now().UnixNano())
	target := ""
	for i := 0; i < len(words)-1; i++ {
		j := rand.Intn(len(words)-i) + i
		words[i], words[j] = words[j], words[i]
	}
	for k := 0; k < 4; k++ {
		target += words[k]
	}
	return target
}

func main() {
	target := ""
	for i := 0; i < 100; i++ {
		target = getTarget()
		if "しがない" == target {
			fmt.Printf("第%d回SIerのSEからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」\n", i + 1)
			return
		}
	}
	fmt.Printf("「%sラジオ」ちゃうやん\n", target)
}
