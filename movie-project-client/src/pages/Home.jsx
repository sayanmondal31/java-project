import Hero from "../components/Hero";
import useMovieStore from "../store/movieStore";

function Home() {
  const [movies] = useMovieStore((state) => [state.movies]);

  return (
    <div className=" bg-black">
      <Hero movies={movies} />
    </div>
  );
}

export default Home;
