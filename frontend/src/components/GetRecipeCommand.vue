<template>

    <v-card outlined>
        <v-card-title>
            GetRecipe
        </v-card-title>

        <v-card-text>
            <String label="RecipeId" v-model="value.recipeId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="getRecipe"
            >
                GetRecipe
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'GetRecipeCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.recipeId = '';
        },
        watch: {
        },
        methods: {
            getRecipe() {
                this.$emit('getRecipe', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

