import Text.Printf (printf)
main :: IO ()
main = do
  a <- getLine
  b <- getLine
  let media = (read a * 3.5 + read b * 7.5) / 11 :: Double
  putStrLn $ "MEDIA = " ++ printf "%.5f" media
