package OOPS;

abstract class Persistence {
        abstract void persist();

    }
    class Filepersistance extends Persistance{
        void persist()
        {
            System.out.println("data is stored in files");
        }
    }
    class DatabasePersistance extends Persistance{
        void persist()
        {
            System.out.println("Data is stored in Database");
        }
    }
    class Dataa
    {
        public static void main(String args[])
        {
            Filepersistence f=new Filepersistence();
            DatabasePersistence d=new DatabasePersistence();
            f.persist();
            d.persist();
        }
    }

