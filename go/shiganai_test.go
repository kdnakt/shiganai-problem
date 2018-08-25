package main

import (
	"testing"
	"strings"
)

func TestShiganaiProducer(t *testing.T) {
	p := &ShiganaiProducer{}
	produced := p.Produce()
	if len(produced) != 4*3 {
		t.Fatal("produced illegal value: " + produced)
	}
	for _, v := range produced {
		if strings.Index("しくてがない", string(v)) < 0 {
			t.Fatal("Invalid character produced: " + string(v))
		}
	}
}

type FalseProducer struct {
}

func (p *FalseProducer) Produce() string {
	return "しながい"
}

func TestFalseProfucer(t *testing.T) {
	fp := &FalseProducer{}
	sp := &ShiganaiProblem{10, fp}
	result := sp.Result()
	if result != "「しながいラジオ」ちゃうやん" {
		t.Fatal("Wrong result")
	}
}

type ThirdProducer struct {
	count int
}

func (p *ThirdProducer) Produce() string {
	p.count++
	if p.count == 3 {
		return "しがない"
	}
	return "しながい"
}

func TestThirdProducer(t *testing.T) {
	tp := &ThirdProducer{}
	sp := &ShiganaiProblem{10, tp}
	result := sp.Result()
	if result != "第3回SIerのSEからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」" {
		t.Fatal(result)
	}
}
