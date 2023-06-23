import { create } from "zustand";
import api from "../api/axiosConfig";

const useMovieStore = create((set) => ({
  movies: [],
  movie: {},
  getAllMovies: async () => {
    try {
      const response = await api.get("api/v1/movies");
      set({ movies: response.data });
    } catch (error) {
      console.log(error);
    }
  },
  getMovieById: async (id) => {
    try {
      const response = await api.get(`api/v1/movies/${id}`);
      set({ movie: response.data });
    } catch (error) {
      console.log(error);
    }
  },
}));

export default useMovieStore;
