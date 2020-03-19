package com.uniandes.grafos.grafos.grafo;

import com.uniandes.grafos.grafos.arco.Arco;
import com.uniandes.grafos.grafos.nodo.Nodo;

public class GrafoDirigidoConBFS extends GrafoBFS {
    @Override
    public void addArco(Nodo nodoOrigen, Nodo nodoDestino) {
        Arco arco = new Arco();
        arco.setOrigen(nodoOrigen);
        arco.setDestino(nodoDestino);
        arcos.add(arco);
        nodoOrigen.agregarArco(arco);
    }
}
