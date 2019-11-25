<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>MyCar - Formoid html5 form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body class="blurBg-false" style="background-color:#EBEBEB">



    <!-- Start Formoid form-->
    <link rel="stylesheet" href="ponto_files/formoid1/formoid-solid-blue.css" type="text/css" />
    <script type="text/javascript" src="ponto_files/formoid1/jquery.min.js"></script>
    <form class="formoid-solid-blue"  action='http://192.168.0.110/registraAjuste.php' style="background-color:#FFFFFF;font-size:18px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:480px;min-width:150px" method="post">
        <div class="title">
            <h2>MyCar APP</h2>
        </div>
        <label align='center' class="title">
            ajustes
        </label>
        <div class="element-date"><label class="title">Data</label>
            <div class="item-cont"><input class="large" data-format="dd-mm-yyyy" type="date" name="data_ajuste" placeholder="Date" /><span class="icon-place"></span></div>
        </div>
        <div class="element-select">
            <label class="title">
                Veiculo
            </label>
            <div>
                <div class="large">
                    <span>
                        <select name="codigo_colab">
                        <option value='' selected>Selecione</option>";
                            <?php
                            $link = mysqli_connect("192.168.0.110", "finan", "kinox", "kinox");
                            if (!$link) {
                                echo "Error: Falha ao conectar-se com o banco de dados MySQL." . PHP_EOL;
                                echo "Debugging errno: " . mysqli_connect_errno() . PHP_EOL;
                                echo "Debugging error: " . mysqli_connect_error() . PHP_EOL;
                                exit;
                            };
                            $sql = "SELECT codigo_colab, nome
                           FROM colaborador
                          WHERE ponto = '1' and ativo='1'
                          ORDER BY nome
                           ";
                            $result = mysqli_query($link, $sql);
                            $row = mysqli_fetch_array($result);
                            $totalDados = mysqli_num_rows($result);
                            if ($totalDados > 0) {
                                do {
                                    echo "<option value='{$row['codigo_colab']}'>{$row['nome']}</option>";
                                } while ($row = mysqli_fetch_assoc($result));
                            };
                            ?>


                        </select>
                        <i></i>
                        <span class="icon-place">
                        </span>
                    </span>
                </div>
            </div>
        </div>
        <div class="element-input">Motivo<label class="title"></label>
            <div class="item-cont"><input class="large" type="text" name="motivo_ajuste" placeholder="motivo" /><span class="icon-place"></span></div>
        </div>
        <div class="element-input">Ajustar Hora<label class="title"></label>
            <div class="item-cont"><input class="large" type="text" name="hora_ajuste" placeholder="" /><span class="icon-place"></span></div>
        </div>
        </div>
        <div class="submit">
        
        <input type="submit" value="Salvar" />
        </div>
    </form>
    <p class="frmd"><a href="http://formoid.com/v29.php">html5 form</a> Formoid.com 2.9</p>
    <script type="text/javascript" src="ponto_files/formoid1/formoid-solid-blue.js"></script>
    <!-- Stop Formoid form-->
    <div class="element-date">
    <table class = 'container' border='1'>
<thead>
     <?php
                                        echo
                                    "<tr>
                                    <th>
                                    cod
                                    </td>
                                     <td>
                                     Nome
                                    </td>
                                     <td>
                                     Data
                                    </td>
                                     <td>
                                     Hora
                                    </td>
                                    <td>
                                    Motivo
                                    </td>
                                    </tr>
                                    </thead>
                                    <tbody>";
                            $link = mysqli_connect("192.168.0.110", "finan", "kinox", "kinox");
                            if (!$link) {
                                echo "Error: Falha ao conectar-se com o banco de dados MySQL." . PHP_EOL;
                                echo "Debugging errno: " . mysqli_connect_errno() . PHP_EOL;
                                echo "Debugging error: " . mysqli_connect_error() . PHP_EOL;
                                exit;
                            };
                            $sql = "SELECT distinct p.codigo_colab, c.nome, p.data, p.motivo, p.hora
                                      FROM colaborador as c
                                INNER JOIN ponto as p
                                        ON c.codigo_colab = p.codigo_colab
                                     WHERE ponto = '1' and ativo='1'
                                  ORDER BY nome, data, hora
                           ";
                            $result = mysqli_query($link, $sql);
                            $row = mysqli_fetch_array($result);
                            $totalDados = mysqli_num_rows($result);
                            if ($totalDados > 0) {
                                do {
                                    echo
                                    "<tr>
                                    <td>
                                    {$row['codigo_colab']}
                                    </td>
                                     <td>
                                    {$row['nome']}
                                    </td>
                                     <td>
                                    {$row['data']}
                                    </td>
                                     <td>
                                    {$row['hora']}
                                    </td>
                                        <td>
                                    {$row['motivo']}
                                    </td>
                                    </tr>";
                                } while ($row = mysqli_fetch_assoc($result));
                            };
                            ?>
           </tbody>
           </table>
           </div>

</body>

</html>
