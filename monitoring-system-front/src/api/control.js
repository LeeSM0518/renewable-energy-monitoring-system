import { control } from './index';

function run() {
  return control.get('run');
}

function stop() {
  return control.get('stop');
}

export { run, stop };
