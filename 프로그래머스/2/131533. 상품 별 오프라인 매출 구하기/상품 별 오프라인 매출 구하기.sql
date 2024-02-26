-- 코드를 입력하세요
SELECT
    p.PRODUCT_CODE pc,
    SUM(p.PRICE * o.SALES_AMOUNT) s
FROM
    PRODUCT p
JOIN
    OFFLINE_SALE o ON p.PRODUCT_ID = o.PRODUCT_ID
GROUP BY
    pc
ORDER BY
    s desc,
    pc asc;