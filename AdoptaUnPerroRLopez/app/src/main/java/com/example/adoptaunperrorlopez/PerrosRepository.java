package com.example.adoptaunperrorlopez;

import java.util.List;

public class PerrosRepository implements Repository {

    private List<Perro> perros = List.of(
            new Perro("1", "Max", "3 años", "Labrador Retriever", "Grande", "labradoretriever", "Max es un perro Labrador Retriever de 3 años de edad. Es un perro muy activo y enérgico que disfruta de largas caminatas y sesiones de juego en el parque. Es extremadamente amigable y le encanta conocer gente nueva y otros perros. Max es muy inteligente y fácil de entrenar, lo que lo convierte en un excelente compañero para actividades al aire libre."),
            new Perro("2", "Luna", "2 años", "Golden Retriever", "Mediano", "goldenretriever", "Luna es una encantadora Golden Retriever de 2 años. Es una perra muy cariñosa y leal que adora pasar tiempo con su familia. Le encanta nadar y jugar en el agua, y es muy sociable con otros perros y personas. Luna tiene una personalidad juguetona y activa, pero también disfruta de largas siestas en el sofá junto a sus seres queridos."),
            new Perro("3", "Rocky", "4 años", "Bulldog Francés", "Pequeño", "bulldogfrances", "Rocky es un Bulldog Francés de 4 años de edad. A pesar de su tamaño pequeño, tiene una personalidad audaz y valiente. Es un perro muy cariñoso y le encanta pasar tiempo con su familia. Rocky es conocido por su naturaleza juguetona y su sentido del humor. Le gusta hacer travesuras y recibir caricias en la barriga."),
            new Perro("4", "Buddy", "5 años", "Pastor Alemán", "Grande", "pastoraleman", "Buddy es un Pastor Alemán de 5 años de edad. Es un perro atlético y fuerte con una disposición amigable y protectora. Buddy es extremadamente leal a su familia y hará cualquier cosa para protegerlos. Es muy inteligente y se destaca en actividades como el entrenamiento de obediencia y los deportes caninos. A pesar de su apariencia imponente, Buddy es un perro suave y amoroso que disfruta de la compañía de su familia."),
            new Perro("5", "Daisy", "1 año", "Bichón Frisé", "Pequeño", "bichonfrise", "Daisy es una adorable Bichón Frisé de 1 año de edad. Es una perra muy juguetona y llena de energía que siempre está lista para una aventura. Daisy tiene una personalidad cariñosa y afectuosa, y adora pasar tiempo con su familia. Es muy sociable y le encanta conocer a nuevas personas y otros perros. Daisy también es conocida por su suave pelaje blanco y rizado, que la hace irresistible para abrazar.")
    );


    @Override
    public List<Perro> findAllPerros() {
        return perros;
    }
}

