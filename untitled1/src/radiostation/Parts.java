package radiostation;

public interface Parts {
    public  int calculate() ;
    public  int getLength();
    public String toString();

//использован паттерн интерфейс
// разделить абстракцию и исполнение через паттерн мост? только из-за одной переменной - длины

}
