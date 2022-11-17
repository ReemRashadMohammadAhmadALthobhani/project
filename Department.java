import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;


public class Department {

        static Collection<String> nameDepartment  = new LinkedList();

        static Collection<String> description = new LinkedList();

        ArrayList<Product> product;

        static int size = 0;

        public Department(ArrayList<Product> product) {
            this.product = product;
        }

        public static Collection<String> getNameDepartment() {
            return nameDepartment;
        }

        public static void setNameDepartment(Collection<String> nameDepatment) {
            Department.nameDepartment = nameDepatment;
        }

        public static Collection<String> getDescription() {
            return description;
        }

        public static void setDescription(Collection<String> description) {
            Department.description = description;
        }

        public ArrayList<Product> getProduct() {
            return product;
        }

        public void setProduct(ArrayList<Product> product) {
            this.product = product;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "product=" + product +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(product, that.product);
    }


}

