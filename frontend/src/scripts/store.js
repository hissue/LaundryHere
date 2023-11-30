import {createStore} from 'vuex'

// Create a new store instance.
const store = createStore({
    state() {
        return {
            accout: {
                id: 0
            }
        }
    },
    mutations: {
        setAccount(state, payload) {
            state.accout.id = payload;
        }
    }
})

export default store;