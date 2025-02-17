package ec.com.sofka.generics.interfaces;


import ec.com.sofka.generics.utils.Request;
import org.reactivestreams.Publisher;

public interface IUseCaseGetElement<T extends Request, R> {
    Publisher<R> get(T request);
}