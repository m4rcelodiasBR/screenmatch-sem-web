package br.com.alura.screenmatch.service;

public interface IConverteDadosService {
    <T> T obterDados( String json, Class<T> classe);
}
