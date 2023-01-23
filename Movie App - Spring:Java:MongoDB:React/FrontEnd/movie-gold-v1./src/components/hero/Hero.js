import './Hero.css';
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';

const Hero = ({movies}) => {
    return (
        <div>
            <Carousel>
                {
                    movies.map((movie) => {
                        return(
                            <Paper>
                                <div className='movie-card-container'>
                                    <div className='movie-card' style={{" --img": `url(${movie.backdrop[0]})`}}>
                                        <div className='movie-detail'>
                                            <div className='movie-poster'>
                                                <img src={movie.poster} alt=""/>
                                            </div>
                                            <div className='movie-title'>
                                                <h4>{movie.title}</h4>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </Paper>
                        )
                    })
                }
            </Carousel>
        </div>
    )
}

export default Hero