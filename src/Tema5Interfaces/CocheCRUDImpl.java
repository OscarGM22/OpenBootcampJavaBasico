package Tema5Interfaces;

import java.sql.SQLOutput;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("Imprimiendo desde el método 'save' de la implementación CocheCRUDImpl de la interface CocheCRUD");
    }

    @Override
    public void findAll() {
        System.out.println("Imprimiendo desde el método 'findAll' de la implementación CocheCRUDImpl de la interface CocheCRUD");
    }

    @Override
    public void delete() {
        System.out.println("Imprimiendo desde el método 'delete' de la implementación CocheCRUDImpl de la interface CocheCRUD");
    }
}
