
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import RecipeManager from "./components/listers/RecipeCards"
import RecipeDetail from "./components/listers/RecipeDetail"

import CustomerManager from "./components/listers/CustomerCards"
import CustomerDetail from "./components/listers/CustomerDetail"
import IngredientManager from "./components/listers/IngredientCards"
import IngredientDetail from "./components/listers/IngredientDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/recipes',
                name: 'RecipeManager',
                component: RecipeManager
            },
            {
                path: '/recipes/:id',
                name: 'RecipeDetail',
                component: RecipeDetail
            },

            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },
            {
                path: '/customers/:id',
                name: 'CustomerDetail',
                component: CustomerDetail
            },
            {
                path: '/ingredients',
                name: 'IngredientManager',
                component: IngredientManager
            },
            {
                path: '/ingredients/:id',
                name: 'IngredientDetail',
                component: IngredientDetail
            },



    ]
})
