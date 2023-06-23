import { useEffect } from "react";

import useMovieStore from "./store/movieStore";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";

function App() {
  const [movies, getAllMovies] = useMovieStore((state) => [
    state.movies,
    state.getAllMovies,
  ]);

  useEffect(() => {
    getAllMovies();
  }, []);

  console.log(movies);

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
