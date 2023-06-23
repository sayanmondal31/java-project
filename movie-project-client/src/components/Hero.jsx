/* eslint-disable react/prop-types */
import Carousel from "react-material-ui-carousel";
import { Paper } from "@mui/material";

function Hero({ movies }) {
  return (
    <div>
      <Carousel>
        {movies?.map((movie) => (
          <div key={movie.id} className="w-[100vw]   relative  ">
            <div className="absolute bg-gradient-to-b from-transparent via-gray-900/60 to-black z-50 w-[100vw] h-full"></div>
            <Paper key={movie.id} className=" h-[90%] ">
              <img
                src={movie.backdrops[0]}
                alt={movie.title}
                className="w-full h-auto object-fill  "
              />
            </Paper>
          </div>
        ))}
      </Carousel>
    </div>
  );
}

export default Hero;
