INSERT INTO `user` 
(idUser, Discriminator, first_name, email,
 second_name, login, password, role, Bus_idBus) VALUES 
(1,1,'Barak', 'Barak@gmail.com', 'Obama', 'barak123', '321karab', 'admin', null),
(2,1,'Donald', 'Donald@gmail.com', 'Trump', 'trump123', '321pmurt', 'admin', null),
(3,2,'Timmy', 'Timmy@gmail.com', 'Vermalen', 'timmy123', '321ymmit', 'driver', 1),
(4,2,'Morganna', 'Morganna@gmail.com', 'Saintinens', 'morganna123', '321annagrom', 'driver', 2),
(5,2,'Sasha', 'Sasha@gmail.com', 'Blue', 'sasha123', '321ahsas', 'driver',3),
(6,2,'Semen', 'Semen@gmail.com', 'Slepakov', 'semen123', '321nemes', 'driver', 4),
(7,2,'Kyrylo', 'Kyrylo@gmail.com', 'Kozhemyaka', 'kyrylo123', '321olyryk', 'driver', 5),
(8,2,'Stephan', 'Stephan@gmail.com', 'Issmich', 'stephan123', '321nahpets', 'driver', 6),
(9,2,'Kyrylo', 'Kyrylo@gmail.com', 'Karasiov', 'kyrylo123', '321olyryk', 'driver', 7),
(10,2,'Alexandr', 'Alexandr@gmail.com', 'Kostyliev', 's1mple123', '321sos1mple', 'driver', 8),
(11,2,'Trinda', 'Trinda@gmail.com', 'Mer', 'trindamer123', '321remadnirt', 'driver', 9),
(12,2,'Cho', 'Cho@gmail.com', 'Gath', 'void123', '321relwarb', 'driver', 10);

INSERT INTO `bus` 
(idBus, model,  name) VALUES 
(1, 'Bogdan',  'A092'),
(2, 'Bogdan',  'A092'),
(3, 'Bogdan',  'A092'),
(4, 'Bogdan',  'A092'),
(5, 'Bogdan',  'A092'),
(6, 'Bogdan',  'A092'),
(7, 'Bogdan',  'A092'),
(8, 'MAZ',  '215'),
(9, 'MAZ',  '215'),
(10, 'MAZ',  '215'),
(11, 'MAZ',  '215'),
(12, 'CityLAZ',  '12'),
(13, 'CityLAZ',  '12'),
(14, 'CityLAZ',  '12'),
(15, 'CityLAZ',  '12');

SELECT * FROM bus;
SELECT * FROM user;