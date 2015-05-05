package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface DefesaAlunoDAO extends GenericDAO<Long, DefesaAluno>{
    

        public Defesaaluno() {
             Defesaaluno defesaaluno1 = new defesaaluno();
    
        }
        public Defesa() {
            Defesa defesa1 = new defesa();
        }
        public Aluno() {
            Aluno aluno1 = new aluno();
        }
        public Pesquisatipotcc() {
            Pesquisatipotcc pesquisatipotcc1 = new pesquisatipotcc();
        }
        public Banca() {
            Banca banca1 = new banca();
        }
        public Defesacomentario() {
            Defesacomentario defesacomentario1 = defesacomentario();
        }
        public nota(){
            double nota1 = new nota();
        }   
        public data{
         String data1 = new data();
        }    
        public status{
            String status1 = new status();
        }  
        public tema{
            String tema1 = new tema();
        }    
    
}
