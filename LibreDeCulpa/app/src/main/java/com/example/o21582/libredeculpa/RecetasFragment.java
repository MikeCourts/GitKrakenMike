package com.example.o21582.libredeculpa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetasFragment extends Fragment implements RecetaAdapter.AdapterInterface {


    public RecetasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recetas, container, false);

        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta("RABAS AL AJO CON DIPS", R.drawable.rabas_4, "1kg de alitas de pollo.\n" +
                "4 huevos\n" +
                "2 tazas de harina\n" +
                "C/n sal\n" +
                "C/n Pimienta\n" +
                "1 taza de Ketchup\n" +
                "1 pocillo de agua\n" +
                "2 cucharadas de Aceto Balsámico SG\n" +
                "1 cucharada de Humo Líquido SG\n" +
                "1 rama de Canela Carmencita\n" +
                "2 cucharaditas de Pimentón Picante Carmencita\n" +
                "1 cucharada de miel.\n" +
                "C/n de aceite para freír.", "1- Secar bien las alitas de pollo con un lienzo limpio.\n" +
                "\n" +
                "2- En un bol tamizar la harina y condimentar con sal y pimienta, aparte desligar los huevos condimentados con sal.\n" +
                "\n" +
                "3- Pasar el pollo por la harina, luego por el huevo y nuevamente por la harina sacudiendo de manera que quede bien impregnado a la carne. Freír en abundante aceite caliente, retirar y servir con la salsa.\n" +
                "\n" +
                "4- Para la salsa, en una ollita pequeña disponer el ketchup, con la rama de Canela Carmencita, el Aceto Balsámico SG y el agua. Una vez que hierve, apagar el fuego y agregar la miel y condimentar con el Pimentón Picante Carmencita y el humo líquido. Dejar enfriar y servir con las alitas de pollo."));
        recetas.add(new Receta("EMPANADA GALLEGA", R.drawable.empanada_gallega, "Ingredientes masa: \n" +
                "\n" +
                "150 gr Manteca \n" +
                "600 gr Harina \n" +
                "5 cucharaditas Polvo de hornear \n" +
                "3 Huevos \n" +
                "1 cucharada Azúcar \n" +
                "2 cucharadas Pimentón Dulce Carmencita\n" +
                "1 cucharadita Sal\n" +
                "¼ taza Leche tibia \n" +
                "Pimienta c/n.\n" +
                "     \n"  +
                "Relleno:\n" +
                "\n" +
                "Aceite de oliva extra virgen SG.\n" +
                "2 latas de Lomitos de Atún en aceite.\n" +
                "1 Pimiento rojo asado.\n" +
                "4 Cebollas.\n" +
                "Cebollas cortas en pluma.\n" +
                "1 lata de Tomates perita.\n" +
                "1 lata de Sardinas\n" +
                "100 gr Aceitunas verdes \n" +
                "¼ taza Aceto andino de frutos del bosque SG.\n" +
                "2 cucharadas de Nubes de Tomate SG. \n" +
                "1 cucharada de Nubes de Ajo SG. \n" +
                "3 Huevos duros.\n" +
                "Sal marina D&A\n" +
                "Pimienta Negra D&A", "Tamizar la harina y colocar en el centro el Pimentón Dulce, el polvo de hornear, el azúcar, la Sal Marina, la Pimienta Negra y la manteca. Mezclar sin amasar e ir incorporando la leche y los huevos. Envolver en papel film y dejar reposar en heladera 1 hora. Rehogar en Aceite de oliva extra virgen las cebollas, la Sal Marina, la Pimienta Negra y luego agregar el tomate, el atún y la sardina. Mezclar y retirar del fuego. Agregar el Aceto Andino de Frutos del Bosque, las Nubes de Ajo, las Nubes de Tomate, las aceitunas, el huevo duro y el pimiento. Estirar la masa y forrar un molde rectangular de 20cm x 25 cm, volcar el relleno, tapar con el resto de la masa y pintar con huevo. Cocinar en horno precalentado a 180º por 30 a 40 minutos aprox. Servir tibia."));
        recetas.add(new Receta("ALITAS CROCANTES CON SALSA PICANTE", R.drawable.alitas_picantes_0, "1kg de alitas de pollo.\n" +
                "4 huevos\n" +
                "2 tazas de harina\n" +
                "C/n sal\n" +
                "C/n Pimienta\n" +
                "1 taza de Ketchup\n" +
                "1 pocillo de agua\n" +
                "2 cucharadas de Aceto Balsámico SG\n" +
                "1 cucharada de Humo Líquido SG\n" +
                "1 rama de Canela Carmencita\n" +
                "2 cucharaditas de Pimentón Picante Carmencita\n" +
                "1 cucharada de miel.\n" +
                "C/n de aceite para freír.", "1- Secar bien las alitas de pollo con un lienzo limpio.\n" +
                "\n" +
                "2- En un bol tamizar la harina y condimentar con sal y pimienta, aparte desligar los huevos condimentados con sal.\n" +
                "\n" +
                "3- Pasar el pollo por la harina, luego por el huevo y nuevamente por la harina sacudiendo de manera que quede bien impregnado a la carne. Freír en abundante aceite caliente, retirar y servir con la salsa.\n" +
                "\n" +
                "4- Para la salsa, en una ollita pequeña disponer el ketchup, con la rama de Canela Carmencita, el Aceto Balsámico SG y el agua. Una vez que hierve, apagar el fuego y agregar la miel y condimentar con el Pimentón Picante Carmencita y el humo líquido. Dejar enfriar y servir con las alitas de pollo."));
        recetas.add(new Receta("SNACKS CON DIPS", R.drawable.snack_ahumado, "1/2 taza de nueces partidas\n" +
                "1/2 taza de castañas de cajú\n" +
                "1/2 taza de maní tostado pelado\n" +
                "2 cucharadas de Aceite de Oliva Extra Virgen SG\n" +
                "3 cucharadas de azúcar mascabo\n" +
                "Sal marina\n" +
                "Pimienta negra\n" +
                "1 cucharadita de Pimentón Dulce Ahumado Carmencita\n" +
                "2 papas grandes\n" +
                "1 taza de queso crema\n" +
                "3 cucharadas de salsa de ajo\n" +
                "Aceite de girasol para freír\n" +
                "2 cucharadas de perejil picado.", "1- Poner en una sartén caliente junto al Aceite de Oliva Extra Virgen SG, las frutas secas y espolvorearlas con el azúcar. Luego mezclar constantemente con una cuchara de madera.\n" +
                "\n" +
                "2- Cuando se empieza a caramelizar agregar la sal, la pimienta negra y el Pimentón Ahumado Dulce Carmencita, volver a mezclar y retirar del fuego. Dejar enfriar bien antes de servir.\n" +
                "\n" +
                "3- En un bol mezclar el queso crema con la salsa de ajo, salpimentar a gusto y reservar.\n" +
                "\n" +
                "4- Con un pela papas o una mandolina, cortar las papas en láminas bien finas, secar bien y freír en abundante aceite caliente hasta que estén bien doradas. Retirar y escurrir sobre papel absorbente. Salar y servir espolvoreando con el perejil picado."));
        recetas.add(new Receta("SHORTCAKES DE FRUTILLA", R.drawable.b_shortcakes_0, "250 gr de frutillas\n" +
                "2/3 taza de azúcar\n" +
                "2 tazas de harina \n" +
                "1/4 taza de cacao\n" +
                "1/2 cucharadita de bicarbonato de sodio\n" +
                "2 cucharaditas de polvo de hornea\n" +
                "1/4 cucharadita de sal\n" +
                "1/2 taza de manteca\n" +
                "2/3 taza de chips de chocolate\n" +
                "1 1/2 taza de crema de leche\n" +
                "1 clara de huevo\n" +
                "1 cucharada de azúcar negra\n" +
                "3 cucharadas de azúcar impalpable\n" +
                "Chocolate rallado\n" +
                "2/3 taza de Aceto Andino con frutos del bosque SG\n" +
                "3 cucharadas de azúcar\n" +
                "425 gr. de chocolate amargo", "Combine las frutillas y 1/3 taza de azúcar; y guarde en la heladera.\n" +
                "\n" +
                "En un bowl grande, mezcle la harina, el cacao, el bicarbonato de sodio, el polvo de hornear, la sal y el azúcar restante. Agregue la manteca y 2/3 taza de chips de chocolate. Revolver.\n" +
                "\n" +
                "Divida la masa en 8 discos. Colocar en una bandeja de horno sobre papel manteca. Pincele con clara de huevo y espolvoree con el azúcar negra y virutas de chocolate.\n" +
                "\n" +
                "Hornee a 200° durante 15-20 minutos o hasta que el palillo insertado en el centro salga limpio. Dejar enfriar.\n" +
                "\n" +
                "Mientras tanto, en un bowl pequeño, batir la crema de leche y el azúcar impalpable hasta que se formen picos duros. Refrigerar.\n" +
                "\n" +
                "Para la salsa de chocolate, en una olla mezcle el aceto andino y 3 cucharadas de azúcar. Llevar a fuego moderado y reducir a la mitad. Retirar del calor y agregar el chocolate amargo hasta derretir. Reservar.\n" +
                "\n" +
                "Para presentar, cortar los shortcakes por la mitad. Intercale los shortcakes con las frutillas con azúcar, crema batida y salsa de chocolate y aceto andino. Terminar con virutas de chocolate."));
        recetas.add(new Receta("PAPAS RELLENAS CON CHAMPIÑONES TRUFADOS Y YOGUR", R.drawable.b_papas_con_cheddar_y_yogur, "2 Papas horneadas \n" +
                "Aceite a la trufa negra SG\n" +
                "Aceite de oliva SG\n" +
                "300gr de champiñones\n" +
                "Sal marina\n" +
                "Pimienta negra\n" +
                "2/3 taza de queso gruyere\n" +
                "1/4 taza de yogur natural\n" +
                "Perejil", "Precaliente el horno a 200ºC. Frote cada papa con un poco de aceite de oliva, luego colóquelas en una bandeja para hornear grande. Hornear hasta que las patatas estén doradas y tiernas.\n" +
                "Ponga a un lado hasta que se enfríen lo suficiente como para manejarlas. Deje el horno encendido.\n" +
                "\n" +
                "Cortar las papas al horno a la mitad, luego utilizar una cucharita para sacar el corazón de la papa y reservar. Dejar un poco de papa alrededor de los bordes para que mantenga su forma.\n" +
                "Caliente el aceite de oliva en una sartén a fuego medio-alto. Agregue los champiñones. Cocine hasta dorar, unos 2 minutos. Agregue una cucharadita de aceite a la trufa negra, sal y pimienta.\n" +
                "\n" +
                "Rellenar las papas con queso gruyere y los champiñones salteados. Servir con una cucharada de yogur natural y perejil picado."));
        recetas.add(new Receta("PAPAS RELLENAS CON CHEDDAR, PANCETA Y HUEVO", R.drawable.b_papas_con_huevo_y_panceta, "2 Papas horneadas \n" +
                "2 lonjas de panceta ahumada\n" +
                "1 cucharadita de condimento ahumado SG\n" +
                "Aceite de oliva SG\n" +
                "80 g de queso Cheddar\n" +
                "Ciboulette\n" +
                "Sal marina\n" +
                "Pimienta negra\n" +
                "2 huevos", "Precaliente el horno a 200ºC . Frote cada papa con un poco de aceite de oliva, luego colóquelas en una bandeja para hornear grande. Hornear hasta que las patatas estén doradas y tiernas.\n" +
                "\n" +
                "Ponga a un lado hasta que se enfríen lo suficiente como para manejarlas. Deje el horno encendido.\n" +
                "\n" +
                "Cortar las papas al horno a la mitad, luego utilizar una cucharita para sacar el corazón de la papa y reservar. Dejar un poco de papa alrededor de los bordes para que mantenga su forma.\n" +
                "\n" +
                "Rallar todo el queso y picar finamente el ciboulette. Picar la panceta y añadirla junto con un tercio del cheddar, y la mayoría del ciboulette a un bowl, luego sazone con condimento ahumado, sal marina y pimienta negra, y mezcle.\n" +
                "\n" +
                "Coloque las papas en una bandeja para hornear. Añadir una cucharada de relleno a cada uno y luego hacer un hueco en el centro.\n" +
                "\n" +
                "Agregue un huevo en el centro de cada papa, espolvorear el queso restante y hornear durante 12 minutos, hasta que el huevo esté cocido, pero aún suave. Cubra con el ciboulette y sirva."));
        recetas.add(new Receta("PAPAS RELLENAS CON QUESO AZUL Y RÚCULA", R.drawable.b_papas_con_queso_azul_y_rucula_1, "Papas Horneadas c/n\n" +
                "222 puñados de rúcula\n" +
                "150 g de queso Azul\n" +
                "Aceite de oliva SG a gusto\n" +
                "Pimienta negra ", "Hornear las papas previamente durante 1 hora a 200°, entibiar por 10 minutos para facilitar el machacado del relleno.\n" +
                "\n" +
                "Una vez que la papa está tibia: ahuecar el corazón de la misma con un tenedor. Cortar la mitad de la rúcula, luego añadirla a la papa machacada junto con el queso azul. Sazonar con pimienta (el queso aportará la sal) y mezclar. Rellene las papas con esta preparación.\n" +
                "\n" +
                "Coloque las papas en una bandeja de hornear y cocine en el horno durante 10 minutos más para calentar y derretir el queso.\n" +
                "\n" +
                "Servir en un plato con rúcula fresca y aceite de oliva mientras la papa está caliente.\n" +
                "\n" +
                "TIP: Si querés hacerlas a la parrilla también podes. Tenes que hervir las papas primero al dente, las rellenás y luego las colocás para que se cocinen cubiertas o envueltas en papel de aluminio. "));
        recetas.add(new Receta("CAMARONES CON SALSA DE SOJA Y MIEL", R.drawable.b_camarones,"500 gr. Camarones, \n" +
                "3 dientes de ajo, \n" +
                "⅓ taza de miel, \n" +
                "¼ taza de Salsa de soja Cepera de San Giorgio\n" +
                "1 cucharada de Jengibre,\n" +
                "1 Limón,\n" +
                "2 cucharadas de aceite de oliva San Giorgio\n" +
                "Cilantro\n" +
                "Arroz basmati", "Batir juntos la miel, la salsa de soja, el ajo y el jengibre en un recipiente mediano. Agregar el limón y los camarones, tapar con papel film y dejar macerar 60 minutos.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Calentar el aceite en una sartén. Una vez caliente, añadir los camarones (sin la marinada) a la sartén. Cocine los camarones en un lado hasta que tomen un color rosado, aproximadamente 1 minuto, luego voltear los camarones y cocinar 1 minuto adicional. Retirar los camarones.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Poner la marinada en la sartén caliente y llevar a fuego lento; cocinar 2-3 minutos o hasta que espese un poco.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Vuelva a poner los camarones a la sartén y cocine con la salsa por 1 minuto adicional. \n" +
                "\n" +
                " \n" +
                "\n" +
                "Servir sobre una base de arroz basmati y decorar con cilantro picado."));
        recetas.add(new Receta("SANDWICH DE BACON VEGETARIANO", R.drawable.b_sand_bacon_vegetal_0, "6  zanahorias grandes\n" +
                "2 cucharadas de aceite de oliva\n" +
                "1/2  cucharada de Humo Líquido\n" +
                "1/2  cucharadita de pimentón ahumado\n" +
                "2 paltas\n" +
                "2 tomates\n" +
                "Cilantro\n" +
                "Pan de sandwich\n" +
                "Queso blanco\n" +
                "Sal\n" +
                "Pimienta negra", "Precalentar el horno a 200º. \n" +
                "\n" +
                "Cortar las zanahorias en lonchas finas. En un bowl mezclar las zanahorias con el aceite de oliva, humo líquido y pimentón ahumado. Dejar macerar.\n" +
                "\n" +
                "Colocar las zanahorias maceradas en una placa de horno y hornear durante 8 minutos, darlas vuelta y cocinar otros 8 minutos, o hasta que los bordes estén crocantes. Dejar enfriar.\n" +
                "\n" +
                "Untar queso blanco sobre el pan y montar el sandwich con el tomate, la palta y las zanahorias. Condimentar con pimienta negra y aceite de oliva."));
        recetas.add(new Receta("POLLO AL CURRY", R.drawable.b_pollo_al_curry, "1 vaso de Arroz Basmati San Giorgio Selections\n" +
                "agua (abundante)\n" +
                "3 cdas. de manteca clarificada o \"ghee\"\n" +
                "hebras de azafrán c/n\n" +
                "1 zanahoria\n" +
                "1 pimiento rojo\n" +
                "300g de pechuga de pollo sin piel\n" +
                "1cda. de cilantro seco\n" +
                "2 cdas. de curry\n" +
                "250ml de leche de coco\n" +
                "200ml de caldo de pollo\n" +
                "sal marina\n" +
                "pimienta", "Calentar en una cazuela la mantera clarificada a fuego medio-alta y saltear la zanahoria y el pimiento cortados en trozos de bocado. Seguir friendo a fuego lento hasta que las verdruas empiecen a tomar color.\n" +
                "\n" +
                "Añadir la pechuga de pollo cortada también en trozos de bocado, sazonar y freír a fuego lento lo justo para que cambie el color\n" +
                "\n" +
                "Agregar el cilantro y el curry. Mezclar para que se repartan las especies, añadir la leche de coco y el caldo de pollo. Cuando rompe hervor, bajar el fuego al mínimo y dejar cocinar 30 minutos\n" +
                "\n" +
                "Mientras se está cocinando el pollo, poner a hervir abundante agua con sal y pimienta molida. Con el agua hirviendo añadir el arroz y cocinar a fuego alto 10 minutos. Una vez listo, escurrir con ayuda de un colador y saltear unos segundos más a fuego vivo en una sartén con una cucharada de manteca clarificada y unas hebras de azafrán."));
        recetas.add(new Receta("PAELLA DE MARISCOS", R.drawable.b_paella, "Aceite de oliva\n" +
                "1 cebolla\n" +
                "4 dientes de ajo\n" +
                "½ manojo de perejil fresco\n" +
                "6 lonjas de panceta\n" +
                "80 g de Fondo de Paella (opcional)\n" +
                "2 pizcas de azafrán\n" +
                "1 cdta. de pimentón ahumado\n" +
                "500g de Arroz Paella San Giorgio Selections\n" +
                "2 calamares en tiritas\n" +
                "2 puñados de arvejas\n" +
                "10 langostinos\n" +
                "500 g de mejillones\n" +
                "1 limón", "Pelar y cortar finamente la cebolla y el ajo. Escoger y picar finamente las hojas de perejil.\n" +
                "\n" +
                "Poner la sartén en el fuego, añadir la panceta y freír hasta que esté dorada y crujiente.Incorporar la cebolla, ajo y perejil, cocinar hasta suavizar.\n" +
                "\n" +
                "Agregar el pimentón ahumado, el arroz, el azafrán, 1 litro de agua y el fondo de paella, cocinar a fuego medio durante 20 minutos, revolviendo de vez en cuando.\n" +
                "\n" +
                "Incorporar 1 litro adicional de agua, las arvejas, langostinos, los mejillones y el calamar. Colocar una tapa en la sartén y cocinar durante 10 minutos más.\n" +
                "\n" +
                "Por último, espolvorear el perejil picado y servir con cuñas de limón para exprimir"));
        recetas.add(new Receta("GRATÉN DE POLLO CROCANTE Y GRUYÉRE", R.drawable.b_graten_de_pollo, "4 muslos de pollo\n" +
                "Sal marina Drogheria Alimentari\n" +
                "Pimienta negra Drogheria  Alimentari\n" +
                "2 cucharadas de Nubes de ajo San Giorgio\n" +
                "1 puñado de Perejil\n" +
                "2 cucharadas de Aceite de oliva San Giorgio\n" +
                "50 gr. de Manteca\n" +
                "6 Cebollas\n" +
                "1 cucharada de romero\n" +
                "1 taza de caldo de verduras\n" +
                "2 tazas de queso Gruyere", "Precalentar el horno a 220º C.\n" +
                "\n" +
                "Colocar los muslos de pollo en un bowl, agregar sal marina, pimienta negra, nubes de ajo, perejil, aceite de oliva e integrar con las manos.\n" +
                "\n" +
                "En una sarten bien caliente, agregar el pollo especiado hasta dorar. Dar vuelta y dorar de los dos lados.\n" +
                "\n" +
                "Retirar.\n" +
                "En la misma sartén donde cocinamos el pollo, agregar la manteca, y cuando se derrita colocar las seis cebollas cortadas en juliana.\n" +
                "\n" +
                "Revolver de vez en cuando y cocinar hasta lograr un caramelizado intenso.\n" +
                "\n" +
                "Cuando las cebollas estén caramelizadas, agregar romero fresco, sal marina, pimienta negra y una taza de caldo de verduras. Cocinar 5 minutos.\n" +
                "\n" +
                "En una bandeja alta para horno colocar las cebollas caramelizadas en la base. Distribuir los muslos de pollo dorados sobre la cebolla y cubrir con dos tazas de queso gruyere rallado.\n" +
                "\n" +
                "Llevar al horno hasta gratinar.\n" +
                "\n" +
                "Servir con una guarnición de papas a la plancha."));
        recetas.add(new Receta("ROLLS DE SALMÓN GLASEADO", R.drawable.b_sushi, "2 tazas de Arroz Sushi San Giorgio Selections\n" +
                "1 raíz de jengibre\n" +
                "1 taza de vinagre de arroz\n" +
                "3 cdas. de azúcar\n" +
                "Sal marina\n" +
                "400 g de salmón sin piel\n" +
                "3 cdas. de Confitura de Mango y Jengibre\n" +
                "2 zanahorias peladas y en juliana\n" +
                "1 taza de pepino en juliana\n" +
                "½ cdta. de aceite de sésamo \n" +
                "1 palta \n" +
                "1 cda. de semillas de sésamo tostadas    \n" +
                "6 hojas tostadas de alga nori \n" +
                "Salsa de soja", "Enjuagar el arroz en varios cambios de agua hasta que el agua salga clara. Reservar.Rebanar el jengibre en rodajas finas. Llevar una olla pequeña de agua a ebullición, agregar el jengibre y blanquear 5 segundos; luego tirar el agua. Regresar la olla al fuego y agregar ¾ taza de vinagre de arroz, 2 cdas. de azúcar y 2 cdas. de agua.\n" +
                "\n" +
                "Sazonar ligeramente con sal. Llevar a fuego lento, revolviendo para disolver el azúcar. Reservar la mitad (esto se usará para condimentar el arroz) y añadir el jengibre blanqueado a la mezcla de vinagre restante, dejar enfriando. \n" +
                "\n" +
                " \n" +
                "\n" +
                "Colocar el arroz y 2 ½ tazas de agua en una olla pequeña. Llevar a ebullición, luego reducir el calor al mínimo y cubrir. Cocinar hasta que el arroz esté tierno y se haya absorbido todo el agua. \n" +
                "\n" +
                "Retirar y dejar reposar con la tapa 10 minutos. Mover el arroz a un bowl y dejar enfriar. Incorporarle ¼ de la mezcla de vinagre reservada,ventilando y mezclando para enfriar rápidamente. Cubrir con una toalla de cocina limpia.Mezclar los pepinos y zanahorias con el ¼ de taza de vinagre restante, 1 cdta. de azúcar, 1 cdta. de sal y el aceite de sésamo. Dejar de lado.\n" +
                "\n" +
                "Salpimentar el salmón, pintarlo con Confitura de Mango y Jengibre y cocinar en una sartén caliente.Retirar y romper con un tenedor.Sobre una hoja de alga nori, colocar el arroz, las zanahorias, el pepino, la palta, el salmón y las semillas de sésamo. Armar el roll. Servir con jengibre en escabeche y salsa de soja."));
        recetas.add(new Receta("RISOTTO TRUFADO", R.drawable.b_rissoto_hongo_0, "3 cdas. de aceite de oliva extra virgen\n" +
                "1 cda. de aceite a la trufa negra\n" +
                "1 cebolla grande\n" +
                "1 taza de Arroz Arborio San Giorgio Selections\n" +
                "1 vaso de vino blanco\n" +
                "1 L de caldo de ave\n" +
                "100 g de manteca\n" +
                "1/2 taza de queso Parmesano rallado\n" +
                "100 g de portobellos fileteados\n" +
                "sal marina\n" +
                "pimienta\n" +
                "pan gritatta c/n\n" +
                "almendras tostadas c/n\n" +
                "jamón cocido c/n\n" +
                "muzzarella c/n", "Rehogar en aceite de oliva con 1 cda. de aceite a la trufa negra, la cebolla picada con sal hasta transparentar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Agregar un chorrito de vino blanco y 1 taza de arroz, tostarlo (hasta que al apoyar apenasla mano se sienta que quema)\n" +
                "\n" +
                " \n" +
                "\n" +
                "Agregar el resto del vino blanco. Una vez que evapora comenzar a agregar con cucharón el caldo caliente. El arroz nunca puede quedar sin líquido y el tiempo total en el fuego tiene que ser de aproximadamente 18 minutos.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Apagar el fuego y agregar la manteca, los portobellos fileteados previamente rehogados, parmesano rallado con un poquito más de caldo y revolver.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Terminar con cubitos de muzzarella, jamón cocido y pan gritatta o almendras tostadas para un toque crocante."));
        recetas.add(new Receta("PECETO CON SALSA AGRIDULCE", R.drawable.b_peceto_c_salsa_agri, "Peceto \n" +
                "1  Zanahoria \n" +
                "1  Cebolla \n" +
                "1  Apio \n" +
                "1 Hoja de Laurel  \n" +
                "Nubes de ajo San Giorgio\n" +
                "Para la salsa:  \n" +
                "1 taza de mermelada de durazno\n" +
                "1 taza de Mostaza de Dijón Delouis Fils\n" +
                "1/2 taza de Manteca\n" +
                "Pimienta Negra Drogheria Alimentari", "Colocar el peceto entero en una olla.\n" +
                "\n" +
                "Agregar las verduras cortadas gruesas, laurel, sal, pimienta y nubes de ajo.\n" +
                "\n" +
                "Luego agregar agua fría hasta cubrir y llevar a ebullición a fuego mínimo.\n" +
                "\n" +
                "Hervir a fuego mínimo por 45 minutos.\n" +
                "\n" +
                "Cuando esté listo, enfriar en la cacerola, cortar en rodajas y reservar en la heladera.\n" +
                "\n" +
                "Para la salsa:\n" +
                "\n" +
                "Mezclar la mermelada de durazno con la Mostaza de Dijón, derretir la manteca e incorporar.\n" +
                "\n" +
                "Presentar en un plato las rodajas superpuestas con la salsa, y decorar con espárragos, tomates cherry y damascos."));



        RecyclerView recyclerView =  view.findViewById(R.id.recyclerView_recetas);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayout.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        RecetaAdapter recetaAdapter = new RecetaAdapter(recetas,  this);
        recyclerView.setAdapter(recetaAdapter);

        return view;
    }

    @Override
    public void irReceta(Receta receta) {
        Intent intent = new Intent(getActivity(), Receta_detalle_activity.class);
        Bundle bundle = new Bundle();
        bundle.putInt(String.valueOf(Receta_detalle_activity.KEY_IMAGEN), receta.getImagen());
        bundle.putString(Receta_detalle_activity.KEY_TITULO, receta.getTitulo());
        bundle.putString(Receta_detalle_activity.KEY_INGREDIENTES, receta.getIngredientes());
        bundle.putString(Receta_detalle_activity.KEY_PREPARACION, receta.getPreparacion());

        intent.putExtras(bundle);
        startActivity(intent);


    }
}
