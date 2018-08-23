package main

import (
	"testing"
)

func TestProduce(t *testing.T) {
	sp := &ShiganaiProblem{10}
	produced := sp.Produce()
	if len(produced) != 4 * 3 {
		t.Fatal("produced illegal value")
	}
}
