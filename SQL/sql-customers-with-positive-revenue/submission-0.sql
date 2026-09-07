-- Write your query below
SELECT customer_id
FROM customers c
WHERE year = 2020
GROUP BY c.customer_id
HAVING SUM(c.revenue) > 0