package codingquwstions;


class Parent {
        void print(){
            System.out.println("Parent");
        }
        void display(){
         print();
        }
    }
    class Child extends Parent{
        void print(){
            System.out.println("Child");
        }
    }
    class Main{
        public static void main(String[] args) {
            Child c = new Child();
            c.display();
        }
    }

