
SELECT * FROM tb_shamily;


SELECT COUNT(*) FROM tb_shamily;

SELECT * FROM tb_shamily WHERE laptop_color is'Bl%';

DELETE FROM tb_shamily WHERE laptop_color = 'Pink';	

UPDATE  tb_shamily SET laptop_dp_inch = 12.5 WHERE laptop_dp_inch = 11.5;

INSERT INTO tb_shamily VALUES (6,'Sony','Pink',689,16.8,52634178,1)

