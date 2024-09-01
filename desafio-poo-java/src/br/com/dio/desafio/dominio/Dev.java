package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
   private String nome;
   private Set <Conteudos> conteudosInscritos = new LinkedHashSet<>();
   private Set <Conteudos> conteudosConcluido = new LinkedHashSet<>();

   public void inscreverBootcamp(Bootcamp bootcamp) {}

   public void progredir() {}

   public void calcularTotalXp() {}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Set<Conteudos> getConteudosInscritos() {
    return conteudosInscritos;
}

public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
}

public Set<Conteudos> getConteudosConcluido() {
    return conteudosConcluido;
}

public void setConteudosConcluido(Set<Conteudos> conteudosConcluido) {
    this.conteudosConcluido = conteudosConcluido;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
    result = prime * result + ((conteudosConcluido == null) ? 0 : conteudosConcluido.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Dev other = (Dev) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (conteudosInscritos == null) {
        if (other.conteudosInscritos != null)
            return false;
    } else if (!conteudosInscritos.equals(other.conteudosInscritos))
        return false;
    if (conteudosConcluido == null) {
        if (other.conteudosConcluido != null)
            return false;
    } else if (!conteudosConcluido.equals(other.conteudosConcluido))
        return false;
    return true;
}

   


}
