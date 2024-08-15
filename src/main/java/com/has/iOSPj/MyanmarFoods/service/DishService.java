package com.has.iOSPj.MyanmarFoods.service;

import com.has.iOSPj.MyanmarFoods.api.model.Dish;
import com.has.iOSPj.MyanmarFoods.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DishService {
    private List<Dish> dishList;

    public DishService() {
        dishList = new ArrayList<>();

        Dish dish1 = new Dish(
                "Mohinga",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FAA47F94E-59C5-40CA-823B-2B1AD0ACC226.jpg",
                "Mohinga is a traditional rice noodle and fish soup dish widely considered the national dish of Myanmar.",
                45,
                1,
                400,
                "Rice noodles, fish, banana stem, lemongrass, ginger, garlic, onion, chickpea flour, fish sauce, turmeric",
                "Boil fish and spices, cook banana stem and add chickpea flour, then mix in the noodles and fish."
        );

        Dish dish2 = new Dish(
                "Laphet Thoke",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FECE2136E-0765-42B1-9299-411EB8464271.jpg?alt=media&token=06af3cba-1ce2-47f1-993b-cc9a0737989f",
                "Laphet Thoke is a traditional fermented tea leaf salad, one of Myanmar's most iconic dishes.",
                20,
                1,
                200,
                "Fermented tea leaves, garlic, peanuts, sesame seeds, dried shrimp, fish sauce, lime juice, chili",
                "Mix the tea leaves with other ingredients and serve with a squeeze of lime juice."
        );

        Dish dish3 = new Dish(
                "Shan Noodles",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FF2264A1C-D03C-4697-B986-7DCCD8DB9FF4.jpg?alt=media&token=8451b8f0-f007-4b06-bcdc-6ff7bc5521fc",
                "Shan Noodles is a popular dish from the Shan State, featuring rice noodles with a savory chicken or pork sauce.",
                30,
                1,
                500,
                "Rice noodles, chicken or pork, tomato, soy sauce, garlic, peanuts, green onions",
                "Cook the meat with tomatoes and soy sauce, then pour over noodles and garnish with peanuts and onions."
        );

        Dish dish4 = new Dish(
                "Burmese Chicken Curry",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FFAF41407-9EFD-413F-9932-6E5FC2824837.jpg?alt=media&token=583da380-e462-44b5-96ab-076eda4861d9",
                "A rich and flavorful curry made with tender chicken and a blend of spices, often served with rice.",
                60,
                1,
                600,
                "Chicken, onion, garlic, ginger, turmeric, cumin, coriander, chili, coconut milk",
                "Sauté spices with onions and garlic, add chicken and coconut milk, and simmer until the chicken is cooked."
        );

        Dish dish5 = new Dish(
                "Ohn No Khao Swe",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FC90B2BFC-0FC7-433A-94C6-EC694119EEA7.jpg?alt=media&token=e9873a54-aea5-40c6-9ab1-48c293f80f4b",
                "Ohn No Khao Swe is a traditional Burmese coconut chicken noodle soup with a rich and creamy flavor.",
                40,
                1,
                700,
                "Rice noodles, chicken, coconut milk, chickpea flour, onions, garlic, turmeric, chili powder, hard-boiled eggs, lime",
                "Cook chicken with spices and coconut milk, prepare the noodles, and serve the soup with garnishes like boiled eggs and lime."
        );

        Dish dish6 = new Dish(
                "Grilled Fish",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FB0D4F557-78E4-484B-88E2-5390AB3A9886.jpg?alt=media&token=5506d831-9645-499b-85c7-6f5314d3abeb",
                "Grilled fish marinated with herbs and spices, often served with a side of rice or salad.",
                20,
                1,
                250,
                "Fish, garlic, ginger, lime, chili, cilantro, fish sauce",
                "Marinate fish with spices and herbs, then grill until cooked through."
        );

        Dish dish7 = new Dish(
                "Burmese Fried Rice",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2F21C14577-647E-42D7-AB40-A0B2B682988F.jpg?alt=media&token=9debf973-6dad-4553-8b6b-8feb079e0b2c",
                "A flavorful fried rice dish with a mix of vegetables, meats, and spices.",
                25,
                1,
                600,
                "Rice, pork, shrimp, onions, garlic, peas, carrots, soy sauce, egg",
                "Stir-fry rice with meat, vegetables, and soy sauce, then scramble in eggs."
        );

        Dish dish8 = new Dish(
                "Mohinga Noodles",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2F303CA816-2453-45E9-9957-753F958F2D18.jpg?alt=media&token=f1f26389-6cd8-44b4-8b29-526cfb537d0f",
                "A variation of Mohinga, this dish features thick rice noodles in a flavorful fish broth.",
                40,
                1,
                450,
                "Thick rice noodles, fish, lemongrass, garlic, ginger, banana stem, chickpea flour",
                "Prepare a fish broth, add noodles and seasonings, and serve hot."
        );

        Dish dish9 = new Dish(
                "Pork Skewers",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2F2E00D7B8-0242-4D6F-8164-4E5EC06CA1D0.jpg?alt=media&token=11da1833-46e7-42a8-9598-4736b283d223",
                "Tender pork skewers marinated in a spicy sauce and grilled to perfection.",
                30,
                1,
                350,
                "Pork, garlic, soy sauce, chili, ginger, honey",
                "Marinate pork pieces in sauce, skewer, and grill until cooked through."
        );

        Dish dish10 = new Dish(
                "Burmese Coconut Noodles",
                "https://firebasestorage.googleapis.com:443/v0/b/auevents-6935e.appspot.com/o/images%2FBD1BE3D9-E01C-4B5A-91EA-05FAC6B01558.jpg?alt=media&token=21105128-b76c-411d-9138-1b1c6fe930c1",
                "A rich and creamy noodle dish made with coconut milk and a variety of vegetables.",
                35,
                1,
                550,
                "Rice noodles, coconut milk, vegetables, garlic, ginger, soy sauce",
                "Cook noodles in coconut milk with vegetables and spices until everything is well combined."
        );

        dishList.addAll(Arrays.asList(dish1, dish2, dish3, dish4, dish5, dish6, dish7, dish8, dish9, dish10));
    }

    // Method to get all dishes
    public List<Dish> getAllDishes() {
        return new ArrayList<>(dishList);
    }
}
