public class Veterinaria<E> {
    private E animal;
    public void setAnimal(E x) {
        animal = x;
    }
    public E getAnimal() {
        return animal;
    }
    public void ggool() {
        Veterinaria <? extends Animal> vet = new Veterinaria <Gato>();

        Veterinaria <? super Gato> vet3 = new Veterinaria <Animal>();
    }
}
class Animal{
}
class Gato extends Animal {
}
class Perro extends Animal {
}

