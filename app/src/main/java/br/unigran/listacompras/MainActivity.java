package br.unigran.listacompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText marca;
    EditText quantidade;
    List<Produtos> dados;
    ListView listagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome=findViewById(R.id.nomeId);
        marca=findViewById(R.id.marcaId);
        quantidade=findViewById(R.id.quantidadeId);
        listagem=findViewById(R.id.listaId);
        ArrayAdapter adapter=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dados);
        listagem.setAdapter(adapter);
    }
    public void salvar(View view){
        Produtos produto = new Produtos();
        produto.setNome(nome.getText().toString());
        produto.setMarca(marca.getText().toString());
        produto.setQuatidade(quantidade.getText().toString());
        dados.add(produto);
        Toast.makeText(this,"Salvo com sucesso",Toast.LENGTH_SHORT).show();
    }
}