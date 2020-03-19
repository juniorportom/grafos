package com.uniandes.grafos.grafos.nodo;

import com.uniandes.grafos.grafos.arco.Arco;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public abstract class NodoBase {
    protected String nombre;
    protected List<Arco> arcos = new ArrayList<>();;

    public void agregarArco(Arco arco) {
        arcos.add(arco);
    }

    public List<NodoBase> getNodosAdyacentes() {
        List<NodoBase> nodos = new ArrayList<>();
        for (Arco arco : arcos) {
            nodos.add(arco.getDestino());
        }
        return nodos;
    }


}
