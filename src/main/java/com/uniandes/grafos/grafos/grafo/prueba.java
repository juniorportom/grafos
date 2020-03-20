package com.uniandes.grafos.grafos.grafo;

import com.uniandes.grafos.grafos.GrafoPruebas;
import com.uniandes.grafos.grafos.arco.Arco;
import com.uniandes.grafos.grafos.nodo.Nodo;
import com.uniandes.grafos.grafos.ruta.Ruta;

import java.util.ArrayList;
import java.util.List;

public class prueba {

    public static void main(String[] args) {
        GrafoPruebas grafoPruebas = new GrafoPruebas();
        GrafoPruebas grafoPruebas2 = new GrafoPruebas();
        List<Nodo> nodos = new ArrayList<>();
        List<Arco> arcos = new ArrayList<>();
        List<Ruta> rutas = new ArrayList<>();
        List<Nodo> nodos2 = new ArrayList<>();
        List<Arco> arcos2 = new ArrayList<>();
        List<Ruta> rutas2 = new ArrayList<>();
        List<Nodo> camino;
        List<Nodo> camino2;

        Nodo nodo = new Nodo();
        nodo.setNombre("A");
        nodos.add(nodo);
        nodo = new Nodo();
        nodo.setNombre("B");
        nodos.add(nodo);
        nodo = new Nodo();
        nodo.setNombre("C");
        nodos.add(nodo);

        Arco arco = new Arco();
        Nodo nodo1 = new Nodo();
        Nodo nodo2 = new Nodo();
        nodo1.setNombre("A");
        nodo2.setNombre("B");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(1);
        arcos.add(arco);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("B");
        nodo2.setNombre("C");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(1);
        arcos.add(arco);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("A");
        nodo2.setNombre("C");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(2);
        arcos.add(arco);

        Ruta ruta = new Ruta();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("A");
        nodo2.setNombre("C");
        ruta.setInicio(nodo1);
        ruta.setFin(nodo2);
        rutas.add(ruta);

        grafoPruebas.setNodos(nodos);
        grafoPruebas.setArcos(arcos);
        grafoPruebas.setRutas(rutas);


        nodo = new Nodo();
        nodo.setNombre("A");
        nodos2.add(nodo);
        nodo = new Nodo();
        nodo.setNombre("B");
        nodos2.add(nodo);
        nodo = new Nodo();
        nodo.setNombre("C");
        nodos2.add(nodo);
        nodo = new Nodo();
        nodo.setNombre("D");
        nodos2.add(nodo);
        nodo = new Nodo();
        nodo.setNombre("E");
        nodos2.add(nodo);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("A");
        nodo2.setNombre("B");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(1);
        arcos2.add(arco);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("B");
        nodo2.setNombre("C");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(1);
        arcos2.add(arco);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("C");
        nodo2.setNombre("D");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(1);
        arcos2.add(arco);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("E");
        nodo2.setNombre("D");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(2);
        arcos2.add(arco);

        arco = new Arco();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("A");
        nodo2.setNombre("C");
        arco.setOrigen(nodo1);
        arco.setDestino(nodo2);
        arco.setPeso(3);
        arcos2.add(arco);

        ruta = new Ruta();
        nodo1 = new Nodo();
        nodo2 = new Nodo();
        nodo1.setNombre("A");
        nodo2.setNombre("E");
        ruta.setInicio(nodo1);
        ruta.setFin(nodo2);
        rutas2.add(ruta);

        grafoPruebas2.setNodos(nodos2);
        grafoPruebas2.setArcos(arcos2);
        grafoPruebas2.setRutas(rutas2);


        // GRAFO_BASICO Prueba 1

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Resultado de GRAFO_BASICO");
        System.out.println("------------------------------------------------------------------------------");

        grafoPruebas.setTipoGrafo("GRAFO_BASICO");
        grafoPruebas2.setTipoGrafo("GRAFO_BASICO");

        grafoPruebas.crearGrafo();
        grafoPruebas2.crearGrafo();

        camino = grafoPruebas.getCaminos();
        camino2 = grafoPruebas2.getCaminos();


        if (camino != null) {
            System.out.println("Camino A -> C encontrado");
            for (Nodo nodoSalida : camino) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> C no encontrado");
        }


        if (camino2 != null) {
            System.out.println("Camino A -> E encontrado");
            for (Nodo nodoSalida : camino2) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> E no encontrado");
        }


        // GRAFO_DIRIGIDO Prueba 1

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Resultado de GRAFO_DIRIGIDO");
        System.out.println("------------------------------------------------------------------------------");
        grafoPruebas.setTipoGrafo("GRAFO_DIRIGIDO");
        grafoPruebas2.setTipoGrafo("GRAFO_DIRIGIDO");

        grafoPruebas.crearGrafo();
        grafoPruebas2.crearGrafo();

        camino = grafoPruebas.getCaminos();
        camino2 = grafoPruebas2.getCaminos();


        if (camino != null) {
            System.out.println("Camino A -> C encontrado");
            for (Nodo nodoSalida : camino) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> C no encontrado");
        }


        if (camino2 != null) {
            System.out.println("Camino A -> E encontrado");
            for (Nodo nodoSalida : camino2) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> E no encontrado");
        }


        // GRAFO_DIRIGIDO_CON_PESO Prueba 1

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Resultado de GRAFO_DIRIGIDO_CON_PESO");
        System.out.println("------------------------------------------------------------------------------");

        grafoPruebas.setTipoGrafo("GRAFO_DIRIGIDO_CON_PESO");
        grafoPruebas2.setTipoGrafo("GRAFO_DIRIGIDO_CON_PESO");

        grafoPruebas.crearGrafo();
        grafoPruebas2.crearGrafo();

        camino = grafoPruebas.getCaminos();
        camino2 = grafoPruebas2.getCaminos();


        if (camino != null) {
            System.out.println("Camino A -> C encontrado");
            for (Nodo nodoSalida : camino) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> C no encontrado");
        }


        if (camino2 != null) {
            System.out.println("Camino A -> E encontrado");
            for (Nodo nodoSalida : camino2) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> E no encontrado");
        }


        // GRAFO_DIRIGIDO_CON_BFS Prueba 1
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Resultado de GRAFO_DIRIGIDO_CON_BFS");
        System.out.println("------------------------------------------------------------------------------");

        grafoPruebas.setTipoGrafo("GRAFO_DIRIGIDO_CON_BFS");
        grafoPruebas2.setTipoGrafo("GRAFO_DIRIGIDO_CON_BFS");

        grafoPruebas.crearGrafo();
        grafoPruebas2.crearGrafo();

        camino = grafoPruebas.getCaminos();
        camino2 = grafoPruebas2.getCaminos();


        if (camino != null) {
            System.out.println("Camino A -> C encontrado");
            for (Nodo nodoSalida : camino) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> C no encontrado");
        }


        if (camino2 != null) {
            System.out.println("Camino A -> E encontrado");
            for (Nodo nodoSalida : camino2) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> E no encontrado");
        }


        // GRAFO_CON_BFS Prueba 1

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Resultado de GRAFO_CON_BFS");
        System.out.println("------------------------------------------------------------------------------");

        grafoPruebas.setTipoGrafo("GRAFO_CON_BFS");
        grafoPruebas2.setTipoGrafo("GRAFO_CON_BFS");

        grafoPruebas.crearGrafo();
        grafoPruebas2.crearGrafo();

        camino = grafoPruebas.getCaminos();
        camino2 = grafoPruebas2.getCaminos();


        if (camino != null) {
            System.out.println("Camino A -> C encontrado");
            for (Nodo nodoSalida : camino) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> C no encontrado");
        }


        if (camino2 != null) {
            System.out.println("Camino A -> E encontrado");
            for (Nodo nodoSalida : camino2) {
                System.out.println(nodoSalida.getNombre());
            }
        } else {
            System.out.println("Camino A -> E no encontrado");
        }

    }
}
