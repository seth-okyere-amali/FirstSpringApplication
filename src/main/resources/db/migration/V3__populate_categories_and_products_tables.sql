insert into categories (id, name) values
                  (default, 'Health & Beauty'),
                  (default, 'Appliances'),
                  (default, 'Electronics'),
                  (default, 'Fashion'),
                  (default, 'Computing & Mobile');

insert into products (id, name, description, price, quantity, category_id) values
    (default, 'Infinix Hot 40i', 'This is a modern phone with good performance','1200.00','50',5),
    (default, 'Dior Sauvage Elixir', 'This is a perfume with good performance, made for the modern day man','3500.00','27',1),
    (default, 'Dell XPS 9365 2-in-1 laptop', 'Slim and lightweight laptop with good performance','5500.00','10',1),
    (default, 'Nike Air force 1', 'This is a trendy sneaker for those who like to explore. All sizes are available','350.00','3',4);