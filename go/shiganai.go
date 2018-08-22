package main

import (
	"fmt"
	"math/rand"
	"time"
)

type MessageProducer interface {
	Produce() string
	Result() string
}

type ShiganaiProblem struct {
	LoopCount int
}

func (p *ShiganaiProblem) Produce() string {
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

func (p *ShiganaiProblem) Result() string {
	target := ""
	for i := 0; i < p.LoopCount; i++ {
		target = p.Produce()
		if "しがない" == target {
			return fmt.Sprintf("第%d回SIerのSEからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」", i + 1)
		}
	}
	return fmt.Sprintf("「%sラジオ」ちゃうやん", target)
}

func main() {
	sp := &ShiganaiProblem{100}
	result := sp.Result()
	fmt.Println(result)
}
