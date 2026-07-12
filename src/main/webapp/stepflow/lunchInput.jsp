<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form>
        <label for="lunch">ランチは何を食べたい？:</label>
        <select id="lunch" name="lunch">
            <option value="japanese">和食</option>
            <option value="western">洋食</option>
            <option value="chinese">中華</option>
        </select>
        <br>
        <label for="amount">金額を選択:</label>
        <select id="amount" name="amount">
            <option value="500">500円</option>
            <option value="1000">1000円</option>
            <option value="1500">1500円</option>
        </select>
        
        <br>
        <input type="submit" value="送信">
    </form>
</body>
</html>