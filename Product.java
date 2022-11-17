class Product {

        String nameProduct;
        double price;
        int quantity;
        String descriptionProduct;
        String dep;

        public Product(String description, int quantity, double price) {
        }

        public Product(String nameProduct, double price, int quantity, String descriptionProduct, String dep) {
            this.nameProduct = nameProduct;
            this.price = price;
            this.quantity = quantity;
            this.descriptionProduct = descriptionProduct;
            this.dep = dep;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quatiy) {
            this.quantity = quantity;
        }

        public String getDescriptionProduct() {
            return descriptionProduct;
        }

        public void setDescriptionProduct(String descriptionProduct) {
            this.descriptionProduct = descriptionProduct;
        }

        public String getDep() {
            return dep;
        }

        public void setDep(String dep) {
            this.dep = dep;
        }



    }

