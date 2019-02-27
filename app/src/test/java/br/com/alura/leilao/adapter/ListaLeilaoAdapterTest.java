package br.com.alura.leilao.adapter;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.ui.recyclerview.adapter.ListaLeilaoAdapter;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class ListaLeilaoAdapterTest {

    @Test
    public void test() {
        Context context = mock(Context.class);

        ListaLeilaoAdapter adapter = Mockito.spy(new ListaLeilaoAdapter(context));
        Mockito.doNothing().when(adapter).atualizaLista();

        adapter.atualiza(asList(new Leilao("CRF 230"), new Leilao("CRF 230"), new Leilao("CRF 230")));

        assertThat(adapter.getItemCount(), is(3));
    }

}
