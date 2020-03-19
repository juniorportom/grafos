package com.uniandes.grafos.grafos.grafo;

import com.uniandes.grafos.grafos.nodo.Nodo;
import com.uniandes.grafos.grafos.nodo.NodoBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class GrafoBFS extends Grafo {

    public boolean existeRuta(String origen, String destino) throws Exception {
        if (buscarRuta(origen, destino) != null) {
            return true;
        }
        return false;
    }

    public List<Nodo> buscarRuta(String origen, String destino) throws Exception {

        Nodo nodoOrigen = buscarNodo(origen);
        Nodo nodoDestino = buscarNodo(destino);
        List<Nodo> nodosRuta = new ArrayList<>();

        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }

        if (buscarRutaDFS(nodosRuta, nodoOrigen, nodoDestino)) {
            return nodosRuta;
        } else {
            return null;
        }
    }

    private boolean buscarRutaDFS(List<Nodo> nodosRuta, Nodo nodoOrigen, Nodo nodoDestino) {

        // agrega el origen
        nodosRuta.add(nodoOrigen);

        // origen y destino son el mismo ?
        if (nodoOrigen.getNombre().equals(nodoDestino.getNombre())) {
            return true;
        }

        // si no son el mismo, revise las rutas usando una pila
        Stack<Nodo> pilaDeNodos = new Stack<>();
        ArrayList<Nodo> nodosVisitados = new ArrayList<>();

        pilaDeNodos.add(nodoOrigen);

        while (!pilaDeNodos.isEmpty()) {
            Nodo actual = pilaDeNodos.pop();

            // ignore los nodos ya visitados
            if (nodosVisitados.contains(actual))
                continue;

            // es el nodo que estamos buscando ?
            if (actual.equals(nodoDestino)) {
                nodosRuta.addAll(pilaDeNodos);
                nodosRuta.add(nodoDestino);
                return true;
            } else {
                // siga buscando en las rutas no visitadas
                nodosVisitados.add(actual);
                for (NodoBase nodo : actual.getNodosAdyacentes()) {
                    if (!pilaDeNodos.contains(nodo))
                        pilaDeNodos.add((Nodo) nodo);
                }
            }
        }
        return false;

    }
}
