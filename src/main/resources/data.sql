INSERT INTO products (productID, name, description, price, img) VALUES
(-1, 'Produto 1', 'Descrição do Produto 1', 10.99, 'img_produto1.jpg'),
(-2, 'Produto 2', 'Descrição do Produto 2', 15.99, 'img_produto2.jpg'),
(-3, 'Produto 3', 'Descrição do Produto 3', 20.99, 'img_produto3.jpg'),
(-4, 'Produto 4', 'Descrição do Produto 4', 25.99, 'img_produto4.jpg'),
(-5, 'Produto 5', 'Descrição do Produto 5', 30.99, 'img_produto5.jpg'),
(-6, 'Produto 6', 'Descrição do Produto 6', 35.99, 'img_produto6.jpg');

INSERT INTO customers (customer_id, name, email, phone, address, password) VALUES
(-1, 'John Doe', 'john.doe@example.com', '123-456-7890', '1234 Main St, Anytown', 'password123'),
(-2, 'Jane Smith', 'jane.smith@example.com', '098-765-4321', '5678 Elm St, Anycity', 'password456'),
(-3, 'Alice Johnson', 'alice.johnson@example.com', '555-123-4567', '9101 Oak St, Somewhere', 'password789'),
(-4, 'Bob Williams', 'bob.williams@example.com', '555-987-6543', '1357 Pine St, Nowhere', 'password101');

INSERT INTO orders (order_id, customer_id, description, status, total, date, delivery_address, payment_method, pickup_or_delivery) VALUES
(-1, -1, 'Pedido de exemplo 1', 'Delivered', 37.97, '2023-03-01', '1234 Main St, Anytown', 'Cartão de crédito', 'Entrega'),
(-2, -1, 'Pedido de exemplo 2', 'Made', 88.96, '2023-03-02', NULL, 'Dinheiro', 'Retirada'),
(-3, -2, 'Pedido de exemplo 3', 'Accepted', 31.98, '2023-03-03', '5678 Elm St, Anycity', 'Débito', 'Entrega'),
(-4, -3, 'Pedido de exemplo 4', 'Ordered', 52.97, '2023-03-04', '9101 Oak St, Somewhere', 'Cartão de crédito', 'Entrega');

INSERT INTO order_items (id, order_id, product_id, quantity, subtotal) VALUES
(-1, -1, -1, 2, 21.98), -- 2 * 10.99
(-2, -1, -2, 1, 15.99), -- 1 * 15.99
(-3, -2, -3, 3, 62.97), -- 3 * 20.99
(-4, -2, -4, 1, 25.99), -- 1 * 25.99
(-5, -3, -2, 2, 31.98), -- 2 * 15.99
(-6, -4, -1, 1, 10.99), -- 1 * 10.99
(-7, -4, -3, 2, 41.98); -- 2 * 20.99

INSERT INTO employees (employee_id, name, email, password, role, permission) VALUES
(-1, 'João Silva', 'joao.silva@example.com', 'senha123', 'Gerente', 'Todas'),
(-2, 'Maria Oliveira', 'maria.oliveira@example.com', 'senha321', 'Vendedor', 'Leitura'),
(-3, 'Carlos Souza', 'carlos.souza@example.com', 'senha456', 'Analista', 'Escrita'),
(-4, 'Ana Costa', 'ana.costa@example.com', 'senha789', 'Suporte', 'Leitura');